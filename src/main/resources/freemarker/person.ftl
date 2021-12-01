<?xml version="1.0" encoding="UTF-8">
<#if showPersonList>
<personList>
<#list personList as person>
    <person>
        <name>${person.name}</name>
        <#if showAge>
        <age>${person.age}</age>
        </#if>
    </person>
</#list>
</personList>
</#if>