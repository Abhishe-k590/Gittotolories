class Demo{
public static void main (String [] args){

String s="This is really Simple Words";
int volwels=0;
int constents=0;
for(int i=0;i<s.length();i++){

if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){

volwels++;

}else if(s.charAt(i)!=' ')
{
constents++;
}
}
System.out.println("volwels :"+volwels );
System.out.println("Constents :"+constents);

}
}