package HTML;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;


public class htmlTest {
	
	
    @Test(expected = ParseException.class )
    public void test() throws ParseException {
        InputStream input = new ByteArrayInputStream(" IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"".getBytes());
        html h = new html(input); 
        h.words();
}
    @Test(expected = ParseException.class )
    public void test1() throws ParseException {
        InputStream input = new ByteArrayInputStream(" ADD HEADING \"Hello World\"".getBytes());
        html.ReInit(input);
        html.words();
}
    
    @Test
	public void test2() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"".getBytes());
       
        html.ReInit(input);
        String[] aa=html.words();
        Assert.assertEquals("parsed correctly",aa[0] );
        
	}


    @Test
	public void test3() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD HEADING WITH TEXT \"Hello World\"".getBytes());
        html.ReInit(input);
        String[] aa=html.words();
        Assert.assertEquals("parsed correctly",aa[0]);
	}

    @Test(expected = ParseException.class )
    public void test4() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD PARAGRAPH  TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"".getBytes());
        html.ReInit(input);
        html.words();
}
    @Test
	public void test5() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"".getBytes());
       
        html.ReInit(input);
        String[] aa=html.words();
        Assert.assertEquals("parsed correctly",aa[0]);
	}
    @Test(expected = ParseException.class )
    public void test6() throws ParseException {
        InputStream input = new ByteArrayInputStream(" ADD LINK WITH TEXT \"Email\" AND \"http://gmail.com\" WITH COLOR \"Green\"".getBytes());
        html.ReInit(input);
        html.words();
}
    @Test
	public void test7() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" WITH COLOR \"Green\"".getBytes());
       
        html.ReInit(input);
        String[] aa=html.words();
        Assert.assertEquals("parsed correctly",aa[0]);
	}
    
    @Test(expected = ParseException.class )
    public void test8() throws ParseException {
        InputStream input = new ByteArrayInputStream(" ADD PARAGRAPH WITH WITH FONT \"Arial\" AND TEXT \"Good bye\"".getBytes());
        html.ReInit(input);
        html.words();
}
    @Test
	public void test9() throws ParseException {
        InputStream input = new ByteArrayInputStream("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"".getBytes());

        html.ReInit(input);
        String[] aa=html.words();
        Assert.assertEquals("parsed correctly",aa[0]);
	}
    ////////////////////////////////////////////////////////////////////////////////////
    // Parse test
    @Test
   	public void Parsetest1() throws ParseException {
           InputStream input = new ByteArrayInputStream("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"".getBytes());
          
           html.ReInit(input);
           String[] aa=html.words();
           Assert.assertEquals("<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\" />",aa[1] );
           
   	}
    @Test
   	public void Parsetest2() throws ParseException {
           InputStream input = new ByteArrayInputStream("ADD HEADING WITH TEXT \"Hello World\"".getBytes());
           html.ReInit(input);
           String[] aa=html.words();
           Assert.assertEquals("<h1> HelloWorld </h1> ",aa[1]);
   	}
    @Test
 	public void Parsetest3() throws ParseException {
         InputStream input = new ByteArrayInputStream("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"".getBytes());
         html.ReInit(input);
         String[] aa=html.words();
         Assert.assertEquals("<p style=\"font-family: Arial;color: Red ;\">  Welcome</p>",aa[1]);
 	}
    @Test
   	public void Parsetest4() throws ParseException {
           InputStream input = new ByteArrayInputStream("ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" WITH COLOR \"Green\"".getBytes());
           html.ReInit(input);
           String[] aa=html.words();
           Assert.assertEquals("<a href=\"http://gmail.com \" style=\"color: Green \" > Email </a> ",aa[1]);
   	}
    @Test
  	public void Parsetest5() throws ParseException {
          InputStream input = new ByteArrayInputStream("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"".getBytes());
          html.ReInit(input);
          String[] aa=html.words();
          Assert.assertEquals("<p style=\"font-family: Arial;color: Red ;\">  Welcome</p>",aa[1]);
  	}
}
