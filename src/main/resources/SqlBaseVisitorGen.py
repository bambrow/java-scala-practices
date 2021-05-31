# -*- coding: utf-8 -*-

import os

if __name__ == '__main__':
    print(os.getcwd())
    with open('../../../gen/antlr/sql/SqlBaseBaseVisitor.java', 'r', encoding='utf-8') as fr:
        with open('../java/antlr/sql/SqlBaseVisitorImpl.java', 'w', encoding='utf-8') as fw:
            fw.write("package antlr.sql;\n\npublic class SqlBaseVisitorImpl extends SqlBaseBaseVisitor<String> {\n\n")
            for line in fr.readlines():
                line = line.strip()
                if line.startswith('@Override'):
                    line_arr = line.split()
                    line1 = line_arr[:6]
                    line1[2] = 'String'
                    line2 = 'System.out.println("' + line1[3].split('(')[0] + '");'
                    line3 = line_arr[6:-1]
                    line4 = '}'
                    fw.write(' '*4 + ' '.join(line1) + '\n' + ' '*8 + line2 + '\n' + ' '*8 + ' '.join(line3) + '\n' + ' '*4 + line4 + '\n\n')
            fw.write("}")
