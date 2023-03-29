package com.Project.SpringAngular.NewsController;
        import com.Project.SpringAngular.DTO.NewsDTO;
        import com.Project.SpringAngular.DTO.NewsSaveDTO;
        import com.Project.SpringAngular.Service.NewsService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping(path = "/save")

    public String saveCustomer(@RequestBody NewsSaveDTO NewsSaveDTO)
    {
        String id = newsService.addNews(NewsSaveDTO);
        return id;
    }

    @GetMapping(path ="/getNews")
    public List<NewsDTO> getNews(){
        List<NewsDTO> allNews = newsService.getAllNews();
        return allNews;
    }
}

