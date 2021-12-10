<?xml version="1.0" encoding="UTF-8">
<#if showPersonList>
<personList>
<#list personList as person>
    <person>
        <#if showName>
        <name>${person.name}</name>
        </#if>
        <#if showAge>
        <age>${person.age}</age>
        </#if>
        <#if showSummary>
        <summary>${person.getSummary()}</summary>
        </#if>
    </person>
</#list>
</personList>
</#if>