import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;

public class PhoneContentProvider extends ContentProvider {
    static final String PROVIDER_NAME="com.app2.cp";
    static final String URL="content://"+PROVIDER_NAME+"/users";
    static final Uri CONTENT_URI = Uri.parse(URL);
    static final String id= "id";

    @Override
    public boolean onCreate() {
        Toast.makeText(getContext().getApplicationContext(), "oncreate ", Toast.LENGTH_SHORT).show();

        return true ;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return "";
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
