public class Endian
{
public static void main(String arg[])
{

int number=32;
end(number);
}
public static void end(int num)
{
int byte0, byte1, byte2, byte3;

byte0 = (num & 0x000000FF) >> 0 ;
byte1 = (num & 0x0000FF00) >> 8 ;
byte2 = (num & 0x00FF0000) >> 16 ;
byte3 = (num & 0xFF000000) >> 24 ;

System.out.println(((byte0 << 24) | (byte1 << 16) | (byte2 << 8) | (byte3 << 0)));
} 
}
