package com.example.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = 'mhr_institution')
class Institution {
    @Id
    String name

    @Column(name = 'displayname')
    String displayName

    @Override
    String toString() {
        return "{Institutuion: name=$name, displayName=$displayName}"
    }

    Institution() {}
}
