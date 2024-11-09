package com.mini.prj.entities;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{
}
