package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OnlineCourseTest {

    // TODO 3: Test setOnlineCourseUrl()

    @Test
    void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {

        OnlineCourse onlineCourse = new OnlineCourse("EIST online 01");
        onlineCourse.setUrl("https://www.google.de/");
        assertEquals(new URL("https://www.google.de/"), onlineCourse.getUrl());

    }

    @Test
    void testSetOnlineCourseUrlWithInvalidUrl() {
        OnlineCourse onlineCourse = new OnlineCourse("EIST online 01");
        assertThrows(MalformedURLException.class, () -> {
            onlineCourse.setUrl(null);
        });
    }
}
