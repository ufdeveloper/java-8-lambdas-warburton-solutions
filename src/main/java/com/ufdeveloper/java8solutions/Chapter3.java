package com.ufdeveloper.java8solutions;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Chapter3 {

    // 1.a
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, element) -> acc + element);
    }

    // 1.b
    public static List<String> artistNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                .map(artist -> new StringBuilder("name=").append(artist.getName()).append(", origin=").append(artist.getOrigin()).toString())
                .collect(toList());
    }

    // 1.c
    public static List<Album> albumsWithAtMost3Tracks(List<Album> albums) {
        return albums.stream()
                .filter(album -> album.getTracks().size() <= 3)
                .collect(toList());
    }

    @ToString
    @Data
    @AllArgsConstructor
    class Artist {
        private String name;
        private String origin;
    }

    @ToString
    @Data
    @AllArgsConstructor
    class Track {
        private String name;
    }

    @ToString(exclude = "tracks")
    @AllArgsConstructor
    class Album {
        private String name;
        private List<Track> tracks;

        List<Track> getTracks() {
            return tracks;
        }
    }
}
