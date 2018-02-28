import HelperClass.StructClass;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonMskToClass {

    public static void getJs(){
        Gson gson = new Gson();
        BufferedReader br;
        List<StructClass> list;
        List<StructClass> list2;
        try {
            br = new BufferedReader(new FileReader("/home/thymomenosgata/IdeaProjects/JsonToClass/src/main/resources/data/test1_msk.json"));
            Type founderListType = new TypeToken<ArrayList<StructClass>>(){}.getType();
            list = gson.fromJson(br, founderListType);
            br = new BufferedReader(new FileReader("/home/thymomenosgata/IdeaProjects/JsonToClass/src/main/resources/data/test1_spb.json"));
            list2 = gson.fromJson(br, founderListType);
            for(StructClass st : list2)
                list.add(st);
            list2.clear();
            System.out.println(list.size());
            System.out.print(list2.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
