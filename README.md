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
            The rain in <span id="bar">Spain</span> falls mainly in the plain.<br/>
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

```html
<!DOCTYPE html>
<html>
    <!-- comment -->
    <head>
        <title>Test</title>
    </head>
    <body>
        <div class="foo" style="font-face: arial">
            The rain in <span id="bar" style="background-color: red;">Spain</span> falls mainly in the plain.<br/>
        </div>
    </body>
</html>
```

(note that the <link> tag is removed)