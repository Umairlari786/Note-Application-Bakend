package Controller;

import com.umair.NoteApp.NoteAppApplication;
import com.umair.NoteApp.repository.NoteInterface;
import model.NoteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class NoteController {
    @Autowired
    NoteInterface i;

    @GetMapping("/getallinfo")
    public List<NoteModel> getallnotes(){
        return i.findAll();
    }
    @PostMapping("/addinfo")
    public NoteModel addNote(@RequestBody NoteModel addinfo){
        return i.save(addinfo);
    }
}
