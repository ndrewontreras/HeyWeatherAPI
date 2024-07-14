package com.example.demo.entities;

import java.util.List;

public class GeocodingResponse {
    private List<GeocodingResult> results;

    public List<GeocodingResult> getResults() {
        return results;
    }

    public void setResults(List<GeocodingResult> results) {
        this.results = results;
    }

    public class GeocodingResult {
        private String name;
        private Geometry geometry;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }
    }

    public class Geometry {
        private Location location;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }

    public class Location {
        long lat;
        long lon;

        public long getLat() {
            return lat;
        }

        public void setLat(long lat) {
            this.lat = lat;
        }

        public long getLon() {
            return lon;
        }

        public void setLon(long lon) {
            this.lon = lon;
        }
    }
}
