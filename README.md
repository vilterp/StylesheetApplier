# Usage #

/home/petev/**basictest.html:**

```html
<!DOCTYPE html>
<html>
    <!-- comment -->
    <head>
        <title>Test</title>
        <link rel="stylesheet" type="text/css" href="/home/petev/basictest.css" />
    </head>
    <body>
        <div class="foo">
            Bla bla bla, <span id="bar">he said "foo" and then sat down</span> bla bla<br/>
        </div>
    </body>
</html>
```

/home/petev/**style.css:**

```css
.foo {
	font-face: arial;
}
#bar {
	background-color: red;
}
```

Do this in Java:

```java
System.out.println( StylesheetApplier.processFile( new File( "/home/petev/basictest.html" ) ) );
```

And you'll get:


