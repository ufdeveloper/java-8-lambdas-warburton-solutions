package com.ufdeveloper.java8solutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class Java8solutionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java8solutionsApplication.class, args);

//        System.out.println("addUp => " + Chapter3.addUp(Stream.of(1, 2, 7)));

//        List<Chapter3.Artist> artists = new ArrayList<>();
//        artists.add(new Chapter3().new Artist("Bryan Adams", "UK"));
//        artists.add(new Chapter3().new Artist("Katy Perry", "USA"));
//        artists.add(new Chapter3().new Artist("Prateek Kuhad", "India"));
//        System.out.println("artistNamesAndOrigins => " + Chapter3.artistNamesAndOrigins(artists));

        List<Chapter3.Album> albums = new ArrayList<>();

        Chapter3.Track track1 = new Chapter3().new Track("album1track1");
        Chapter3.Track track2 = new Chapter3().new Track("album1track2");
        Chapter3.Track track3 = new Chapter3().new Track("album1track3");
        Chapter3.Track track4 = new Chapter3().new Track("album1track4");
        albums.add(new Chapter3().new Album("album1", Arrays.asList(track1, track2, track3, track4)));

        track1 = new Chapter3().new Track("album2track1");
        track2 = new Chapter3().new Track("album2track2");
        track3 = new Chapter3().new Track("album2track3");
        albums.add(new Chapter3().new Album("album2", Arrays.asList(track1, track2, track3)));

        track1 = new Chapter3().new Track("album3track1");
        track2 = new Chapter3().new Track("album3track2");
        albums.add(new Chapter3().new Album("album3", Arrays.asList(track1, track2)));

        System.out.println("albumsWithAtMost3Tracks => " + Chapter3.albumsWithAtMost3Tracks(albums));

    }

}
