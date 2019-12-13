package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.models.Chapter;

import java.io.IOException;
import java.util.List;

@RestController
public class ChapterController {
    @Autowired
    private Database db;

    @CrossOrigin
    @PostMapping("/api/v1/chapters")
    public void addNewChapter(
            @RequestBody Chapter chapter) {
        db.save(chapter);
    }

    @CrossOrigin
    @GetMapping("/api/v1/chapters")
    public List<Chapter> getChapters() throws IOException {
        List<Chapter> allStories = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Chapter.class);
        return allStories;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/v1/chapters/{id}", method = RequestMethod.GET)
    public Chapter searchForChapterByID(@PathVariable("id") String id) {
        return db.find(Chapter.class, id);
    }

}
