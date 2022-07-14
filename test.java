import java.net.URL;
import java.io.InputStream;
import java.io.DatalnputStream;
import java.io.Reader;
import java.util.HashMap;
public class Proxy {
public static String get (String uri){
String data='';
InputStream stream = null ;
int length;
byte] buf = new byte[1024];
try {
URL ur| = new URL(uri);
stream = new
DatalnputStream(url.openStream));
while (length = stream.read (buf))!=
-1){
data += new String (buf);
buf = new byte[1024];
7
data= data.trimO;
}catch (Exception e) f
e.printStackTrace0;
}finally {
try {
if (stream != null) {
stream.close0;