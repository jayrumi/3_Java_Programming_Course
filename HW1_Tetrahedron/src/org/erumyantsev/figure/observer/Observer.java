package org.erumyantsev.figure.observer;

import org.erumyantsev.figure.entity.Tetrahedron;

public interface Observer{
    void update (Tetrahedron tetrahedron);
}