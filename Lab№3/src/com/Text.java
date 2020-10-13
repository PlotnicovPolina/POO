package com;
import java.lang.String;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Text {
    String str;
    char s;
    public Text (String str){
        this.str=str;
    }
    public void TextCalculations(){
        int count1 = 0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0, count10=0, count11=0,count12=0, count=0;
        for (int i = 0; i < str.length(); i++) {
            count4++;
            s = str.charAt(i);
            if (s==' ') {
                count1 ++;//numbers of words
            } else if (s == '.' || s == '!' || s == '?' || s == ';'){
                count12++;//number of punctuation marks
                count2++;//number of sentences
            } else if (s=='–' || s=='-' || s==',' || s==':' || s=='(' || s==')' || s=='\''){count12++;}
        }
        for(int i=0;i<str.length();i++){
            s = str.charAt(i);
            if(s=='а' || s=='у' || s=='е' || s=='ё' || s=='и' || s=='о' || s=='ы' || s=='э' || s=='ю' || s=='я'||s=='А' || s=='У' || s=='Е' || s=='Ё' || s=='И' || s=='О' || s=='Ы' || s=='Э' || s=='Ю' || s=='Я'){
                count3++;//number of letters
                count5++;//number of Russian vowels
                count10++;//number of Russian letters
            }
            else if(s=='б' || s=='в' || s=='г' || s=='д' || s=='ж' || s=='з' || s=='й' || s=='к' || s=='л' || s=='м'||s=='н' || s=='п' || s=='р' || s=='с' || s=='т' || s=='ф' || s=='х' || s=='ц' || s=='ч' || s=='ш' || s=='щ'||s=='Б' || s=='В' || s=='Г' || s=='Д' || s=='Ж' || s=='З' || s=='Й' || s=='К' || s=='Л' || s=='М'||s=='Н' || s=='П' || s=='Р' || s=='С' || s=='Т' || s=='Ф' || s=='Х' || s=='Ц' || s=='Ч' || s=='Ш'|| s=='Щ'){
                count3++;
                count6++;//number of Russian consonants
                count10++;
            }
            else if(s=='ь' || s=='ъ'){
                count3++;
                count10++;
            }
            else {
                if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='y' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='Y'){
                    count3++;
                    count7++;//number of English vowels
                    count11++;//number of English letters
                }
                else if(s=='b' || s=='c' || s=='d' || s=='f' || s=='g' || s=='h' || s=='j' || s=='k' || s=='l' || s=='m'||s=='n' || s=='p' || s=='q' || s=='r' || s=='s' || s=='t' || s=='v' || s=='w' || s=='x' || s=='z' || s=='B' || s=='C' || s=='D' || s=='F' || s=='G' || s=='H' || s=='J' || s=='K' || s=='L' || s=='M'||s=='N' || s=='P' || s=='Q' || s=='R' || s=='S' || s=='T' || s=='V' || s=='W' || s=='X' || s=='Z'){
                    count3++;
                    count8++;//number of English consonants
                    count11++;
                }
                else {count9++;}//number of other signs
            }

        }
        System.out.println("Number of symbols:"+(count4));
        System.out.println("Number of words:"+(count1+1));//given that the last word don't have space
        System.out.println("Number of sentences:"+count2);
        System.out.println("Number of letters:"+count3);
        System.out.println("Number of Russian letters:"+count10);
        System.out.println("Number of English letters:"+count11);
        System.out.println("Number of Russian vowels"+count5);
        System.out.println("Number of Russian consonants"+count6);
        System.out.println("Number of English vowels"+count7);
        System.out.println("Number of English consonants"+count8);
        System.out.println("Number of punctuation marks:"+count12);
        System.out.println("number of other signs:"+(count9-count12-count1));//given that we don't calculate punctuation marks and space in second cycle
    }

  /*  public void Word(String str){
        String str2="";
        char s,s2;
        for (int i = 0; i < str.length(); i++){
            s = str.charAt(i);
            s2=str2.charAt(i);
            if(s!='\''){s=s2;}}
        System.out.println(str2);
            Set<String> words = new HashSet<String>(Arrays.asList(str.split(" ")));
    }*/

}