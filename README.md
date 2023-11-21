# KST/BPALP - Cvičení 09

**20. 11. 2023**

OOP procvičování

# Rezervační systém

Vytvořte zjednodušený systém pro rezervaci a správu míst ve vlaku.

## Třída Vagon:

* Reprezentující vagon vlaku.
* Dvourozměrné pole sedadel typu boolean, kde true znamená rezervované místo a false volné místo.
* Metoda rezervujMisto pro rezervaci sedadla.
* Implementovat metodu pro uvolnění rezervovaného místa.

## Třída Vlak:

* Obsahující pole objektů typu Vagon.
* Přidání a odebírání vagonů z vlaku.
* Zobrazení informací o jednotlivých vagonech a dostupných místech (volné místo = "_", rezervované místo = "X").
* Rezervace konkrétního místa v konkrétním vagonu.
* Výpočet celkového počtu volných míst ve vlaku a v jednotlivých vagonech.

## Třída App:
* Vytvořit uživatelské menu pro interakci s aplikací.
* Aplikace by měla umožňovat uživateli přidávat a odebírat vagony, rezervovat a uvolňovat místa, a zobrazovat aktuální stav obsazenosti vlaku.

![vagony](https://github.com/upcefeibpalp/uloha9ab-rezervacni-system-vlak-template/assets/99091934/983bb37c-3bcf-40ec-939a-e6220b84a055)

