package com.example.gheemilkapi.controller;

import com.example.gheemilkapi.model.Subscription;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    // Temporary in-memory "database"
    private Map<Integer, Subscription> db = new HashMap<>();

    // More methods coming here...
    @PostMapping
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        // Set a new ID (auto-increment simulation)
        int newId = db.size() + 1;
        subscription.setId(newId);

        // Save to in-memory map
        db.put(newId, subscription);

        // Return the created subscription
        return subscription;
    }
}
