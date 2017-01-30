package com.allstate.services;

import com.allstate.entities.Klass;
import com.allstate.repositories.IKlassRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KlassServices {
    private IKlassRepositories klassRepositories;

    @Autowired
    public void setKlassRepositories(IKlassRepositories klassRepositories) {
        this.klassRepositories = klassRepositories;
    }


    public Klass createKlass(Klass klass) {
        return this.klassRepositories.save(klass);
    }
}
