import org.petev.stylesheetapplier;

public class Test {

	public static void main( String[] args ) {
		String htmlFile = "basictest.html";
		System.err.printf( "Processing %s...\n", htmlFile );
		String result = StylesheetApplier.processFile( new File( htmlFile ) );
		System.out.println( result );
	}

}
