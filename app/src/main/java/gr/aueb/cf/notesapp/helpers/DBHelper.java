package gr.aueb.cf.notesapp.helpers;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBHelper {
    public static FirebaseDatabase databaseReference = FirebaseDatabase.getInstance();
    public static FirebaseAuth auth = FirebaseAuth.getInstance();

    public static DatabaseReference getNotesReference() {
        return databaseReference.getReference(getCurrentUserId()).child("notes");
    }

    public static String getCurrentUserId() {
        return auth.getCurrentUser().getUid();
    }
}
