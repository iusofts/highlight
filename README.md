# highlight
全文检索文本高亮，可配合solr、es使用

```
String content = "市场时常会失控，所以要时常把握市场。";
String keyword[] = "市场 suoyi".split(" ");
System.out.println(HighlightUtil.contentHighlight(content, keyword, true, 0));
System.out.println(HighlightUtil.contentHighlight(content, keyword, true, 12));
```

#out

```<font color='red'>市场时常</font>会失控，<font color='red'>所以</font>要<font color='red'>时常</font>把握<font color='red'>市场</font>。```

```<font color='red'>市场时常</font>会失控，<font color='red'>所以</font>要<font color='red'>时</font>...```
