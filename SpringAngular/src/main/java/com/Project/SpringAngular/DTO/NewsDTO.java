package com.Project.SpringAngular.DTO;

public class NewsDTO {
    private int newsid;
    private String newstitle;
    private String newscontent;

    public NewsDTO(int newsid, String newstitle, String newscontent) {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newscontent = newscontent;
    }

    public NewsDTO() {
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    @Override
    public String toString() {
        return "NewsDTO{" +
                "newsid=" + newsid +
                ", newstitle='" + newstitle + '\'' +
                ", newscontent='" + newscontent + '\'' +
                '}';
    }
}
