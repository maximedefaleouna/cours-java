# Programmation Orientee Objet en Java (POO) - Cours et Exercices Pratiques

Projet pedagogique complet dedie a l'apprentissage approfondi de la Programmation Orientee Objet en Java, integrant a la fois les concepts fondamentaux de conception logicielle et les fonctionnalites modernes de Java (Java 17+).

Ce repertoire regroupe des implementations de reference, des exemples progressifs et des fiches synthetiques illustrant les principes essentiels d'architecture orientee objet.

## Objectifs Pedagogiques

- Maitriser les quatre piliers fondamentaux de la POO : Encapsulation, Heritage, Polymorphisme et Abstraction.
- Comprendre la difference fondamentale entre resolution statique (compilation) et resolution dynamique (execution).
- Utiliser les fonctionnalites modernes du langage Java (Java 16 et 17) : Sealed Classes (classes scellees), Records (structures immuables) et methodes d'interface par defaut (default methods).
- Appliquer les bonnes pratiques de conception logicielle : reduction du couplage, reutilisation saine du code et protection de l'integrite des objets.

## Architecture des Notions Abordees

Le projet est organise en modules thematiques au sein du dossier source :

### 1. Encapsulation et Immutabilite (package Encapsulation)

L'encapsulation consiste a regrouper l'etat interne (attributs) et les comportements (methodes) d'un objet tout en restreignant l'acces direct aux donnees afin de garantir la coherence du systeme.

- Protection des donnees : declaration des variables membres avec le modificateur d'acces `private` dans la classe `Voiture` (marque, vitesse).
- Accesseurs et mutateurs : fourniture de `getters` et `setters` controles.
- Regles metier et validation : la methode `accelerer(int value)` empeche l'ajout de valeurs negatives, tandis que `freiner(int value)` verifie que la deceleration ne conduit pas a une vitesse inferieure a zero.
- Structures de donnees modernes (Java Records) : utilisation du `record Localisation(int latitude, int longitude)` pour representer des donnees geographiques (situation du Togo : latitude 8 degres, longitude 1 degre). Le record genere automatiquement le constructeur canonique, les accesseurs en lecture seule, ainsi que les methodes `equals()`, `hashCode()` et `toString()`, tout en assurant une immutabilite stricte.

### 2. Heritage et Classes Scellees (package Heritage)

L'heritage permet d'etablir une relation hierarchique du general au specifique, favorisant la reutilisation du code sans duplication.

- Hierarchie parent-enfant : la classe de base `Animal` transmet son attribut `protected String nom`, son constructeur parent via l'instruction `super(nom)` et ses comportements communs a ses sous-classes.
- Specialisation : les sous-classes `Chien` et `Chat` etendent `Animal` en ajoutant des comportements specifiques (comme la methode `aboyer()` pour le chien).
- Classes Scellees (Sealed Classes - Java 17+) : la super-classe est declaree avec `public sealed class Animal permits Chat, Chien`. Ce mecanisme moderne de Java permet a l'architecte de restreindre explicitement quelles classes ont le droit d'etendre la classe mere, empechant toute extension non controlee et securisant le typage. Les sous-classes autorisees cloturent la hierarchie avec le mot-cle `final`.

### 3. Polymorphisme Statique et Dynamique (package Polymorphisme)

Le polymorphisme confere a une meme entite (methode ou reference) la capacite d'adopter des formes et des comportements distincts.

- Polymorphisme statique (Surcharge / Overloading) :
  - Realise au moment de la compilation (compile-time).
  - La classe `Calculatrice` expose plusieurs methodes `additionner` partageant le meme nom mais avec des listes de parametres differentes : deux entiers `additionner(int, int)`, trois entiers `additionner(int, int, int)` ou deux nombres a virgule `additionner(double, double)`. Le compilateur selectionne la variante appropriee selon la signature lors de l'appel.
- Polymorphisme dynamique (Redefinition / Overriding) :
  - Realise au moment de l'execution (run-time).
  - La sous-classe `Porpo` etend `Calculatrice` et redefinit avec l'annotation `@Override` le comportement de `additionner(int a, int b)`.
- Liaisons polymorphiques et Transtypage (Casting) :
  - Affectation d'une instance enfant a une reference de classe parente : `Calculatrice c = porpo;`. L'appel de `c.additionner(7, 5)` execute dynamiquement l'implementation de `Porpo`, demontrant que la methode reellement executee depend du type effectif de l'objet en memoire.
  - Descente de type (Downcasting explicite) : `Porpo d = (Porpo) c;` permet d'acceder aux methodes specifiques de l'enfant (`getVersion()`).

### 4. Abstraction et Interfaces (package Abstraction)

L'abstraction permet d'isoler la definition des fonctionnalites de leur implementation reelle, imposant un contrat strict aux classes derivees.

- Contrats d'interfaces : `Allumage2` definit l'obligation d'eteindre (`void eteindre()`). L'interface `Allumage` etend `Allumage2` et introduit la methode `allumer()` ainsi qu'une methode par defaut `default void Cick()`.
- Classes abstraites : `Appareil implements Allumage` sert de classe passerelle. Elle combine une methode abstraite sans corps `public abstract void seConnecter();` et une methode concrète `branche()`.
- Implementation concrète : la classe finale `Android extends Appareil` fournit les implementations materielles effectives de l'ensemble des methodes du contrat.

### 5. Types Enumeres (package Enum)

L'enumeration `PointCardinal` modelise un ensemble ferme de constantes (NORD, SUD, EST, OUEST). Elle enrichit l'enumeration Java standard avec un constructeur prive, un attribut d'instance immuable (`libelleCourt` : "N", "S", "E", "O") et un accesseur dedie.

## Demonstration et Sortie Console (Main.java)

La classe `Main.java` sert de point d'entree executable reliant l'ensemble des modules dans un scenario pratique :

```text
Cours java 2025
Vitesse actuelle : 300
Marque: Toyota, Vitesse: 300 km/h
La situation geographique du Togo est : Latitude 8 Dégre et Longitude 1 Dégré
 constructeur Parent appélé
 constructeur enfant appélé
Rambo mange comme un chien
Rambo aboie ouuuuf
4 + 6 = 10
10 + 20 + 20 = 50
4 + 4 = 8 depuis porpo
porpo: 5.0
7 + 5 = 12 depuis porpo
d: 5.0
Appareil allumer
Branche technologique
on descend la barre puis wifi
Appareil éteint
clique
```

## Structure des Paquets

- `src/Encapsulation` : Modeles a acces restreint (Voiture) et records immuables (Localisation).
- `src/Heritage` : Hierarchie securisee via classes scellees (Animal, Chat, Chien) et fiches memoires.
- `src/Polymorphisme` : Surcharges de methodes (Calculatrice), redefinitions dynamiques (Porpo) et transtypage.
- `src/Abstraction` : Interfaces chainees, methodes par defaut et implementations d'appareils.
- `src/Enum` : Enumeration parametree des points cardinaux.
- `src/Main.java` : Orchestration globale et validation des comportements.

## Prerequis et Environnement

- Java Development Kit (JDK) 17 ou version superieure (necessaire pour la prise en charge des Sealed Classes et des Records).
- Compatible avec tous les IDE Java modernes : IntelliJ IDEA, Eclipse, Apache NetBeans ou VS Code.

## Compilation et Execution en Ligne de Commande

1. Cloner le depot :

```bash
git clone https://github.com/maximedefaleouna/cours-java.git
cd cours-java
```

2. Compiler l'ensemble des sources dans un dossier de destination :

```bash
javac -d bin $(find src -name "*.java")
```

3. Executer le programme principal :

```bash
java -cp bin Main
```

## Auteur

- Concepteur : Maxime DEFALEOUNA ([@maximedefaleouna](https://github.com/maximedefaleouna))

## Licence

Ce projet est distribue sous licence MIT. Il peut etre utilise, partage et adapte librement a des fins pedagogiques et professionnelles.
