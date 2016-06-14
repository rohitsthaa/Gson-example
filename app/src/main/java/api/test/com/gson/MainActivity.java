package api.test.com.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    String json = "{\n" +
            "  \"Graduate\":\n" +
            "  {\n" +
            "    \"Faculty\": \"CE\",\n" +
            "    \"Year\": 4,\n" +
            "    \"Class\":\n" +
            "    [\n" +
            "      {\n" +
            "        \"Name\": \"Satan Pandeya\",\n" +
            "        \"Roll_No\": 39\n" +
            "      },\n" +
            "      {\n" +
            "        \"Name\": \"Niraj Thapa\",\n" +
            "        \"Roll_No\": 29\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = (TextView)findViewById(R.id.name);
        Gson gson = new Gson();

         Student test = gson.fromJson(json, Student.class);
        name.setText(test.getGraduate().getYear().toString());



        Toast.makeText(this,test.getGraduate().getFaculty(), Toast.LENGTH_SHORT).show();
    }
}
