package Test.packer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import main.Q5;

public class Q5Test {
    @Test
    public void testcase1()throws Exception{
       var q5 = new Q5();
       assertSame( " Test case 1",true, q5.solution("madam"));
      }    
    @Test
    public void testcase2()throws Exception{
       var q5 = new Q5();
       assertSame( " Test case 2",false, q5.solution("teacher"));
      }  @Test
      public void testcase3()throws Exception{
         var q5 = new Q5();
         assertSame( " Test case 3",true, q5.solution("malayalam"));
        }  @Test
        public void testcase4()throws Exception{
           var q5 = new Q5();
           assertSame( " Test case 4",true, q5.solution("mom"));
          }   @Test
          public void testcase5()throws Exception{
             var q5 = new Q5();
             assertSame( " Test case 5",false, q5.solution("leader"));
            }     @Test
            public void testcase6()throws Exception{
               var q5 = new Q5();
               assertSame( " Test case 6",true, q5.solution("civic"));
              }    @Test
              public void testcase7()throws Exception{
                 var q5 = new Q5();
                 assertSame( " Test case 7",true, q5.solution("radar"));
                }        @Test
                public void testcase8()throws Exception{
                   var q5 = new Q5();
                   assertSame( " Test case 8",true, q5.solution("level"));
                  }      @Test
                  public void testcase9()throws Exception{
                     var q5 = new Q5();
                     assertSame( " Test case 9",false, q5.solution("root"));
                    }        @Test
                    public void testcase10()throws Exception{
                       var q5 = new Q5();
                       assertSame( " Test case 10",true, q5.solution("refer"));
                      }                                                                                                                                           
   }    
   
    
