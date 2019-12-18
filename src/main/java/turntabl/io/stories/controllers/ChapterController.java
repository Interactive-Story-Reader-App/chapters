package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.algorithm.Logic;
import turntabl.io.stories.algorithm.Processing;
import turntabl.io.stories.models.Chapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.cloudant.client.api.query.Expression.*;
import static com.cloudant.client.api.query.Operation.and;

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
    @GetMapping("/api/v1/chapters/story/{id}")
    public List<Chapter> getChapterCandidates(@PathVariable("id") String story_id){
        db.createIndex(TextIndex.builder().string("story_id").definition());

        QueryResult<Chapter> chapter = db.query(new QueryBuilder(
                eq("story_id", story_id)).
                build(), Chapter.class);

        Processing.doProcessing(chapter.getDocs());

        return chapter.getDocs();
    }

    @CrossOrigin
    @GetMapping("/api/v1/chapters/story/{id}/all")
    public List<Chapter> getChapterForStory(@PathVariable("id") String story_id){
        db.createIndex(TextIndex.builder().string("story_id").definition());

        QueryResult<Chapter> chapter = db.query(new QueryBuilder(
                eq("story_id", story_id)).
                build(), Chapter.class);

        return chapter.getDocs();
    }

    @CrossOrigin
    @RequestMapping(value = "/api/v1/chapters/{id}", method = RequestMethod.GET)
    public Chapter searchForChapterByID(@PathVariable("id") String id) {
        return db.find(Chapter.class, id);
    }

}
