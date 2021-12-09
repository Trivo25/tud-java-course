---
title: Adventskalender-Aufgabe
---

# Aufgabe vom Programmierkurs 8

### Entwickelt einen Adventskalender!

- Klassen:
    - (Tipp: Als UML-Diagramm zeichnen)
    - `Adventskalender`
    - `Tuer`
        - `subclass` `LetzteTuer`

- `Tuer`-Objekte in einem Array speichern
    - z.B. `Tuer[] tueren = new Tuer[24];`
    - diesen mit einer for-Schleife auffüllen
        - Verwendung von 6 verschiedenen Inhalten
- Nutzereingabe, um Tür zu öffnen
    - `Scanner`
    - Kontrolle, ob es diese Tür gibt
        - 28 wäre zu groß, -1 zu klein
    - beim Türöffnen wird
        - das `Tuer`-Objekt in dem Array gefunden
        - eine Methode von ihm aufgerufen
- Erweiterungsidee:
    - so lange neue Türen öffnen, wie der Nutzer noch korrekte Eingaben macht
    - verbieten, dass der Nutzer Türen überspringt
    - Matheaufgabe bei jeder Tür lösen lassen