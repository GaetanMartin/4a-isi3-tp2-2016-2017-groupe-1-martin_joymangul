**MARTIN Gaëtan :**

**JOYMANGUL Jensen :**

# Rapport TP2

## Question 1
Le patron de conception visiteur :
![Package graph](images/Question1.png)

Le choix du design pattern est pertinent dans ce cas car dans l'éventualité du implémentation de parcour du graphe binaire, 
il faudra seulement ajouter une classe qui implémentera l'interface `Visitor`.

On peut ajouter un nouveau parcour sans avoir besoin de modiifier les classes/le code existant.


## Question 2  / Question 3
Pour définir les different types de parcour, il faut modiifer les classes `Infix`, `Postfix`, `Prefix`.
Le code suivant représent l'affichage Infix pour une addition et ce code est présent dans la classe `Infix`

```java
public void visitAddition(Addition addition) {
    addition.getOpG().accept(this);
    System.out.println(addition.getOp());
    addition.getOpD().accept(this);
}
```

L'appel à cette fonction dans les visiteurs se fait dans les classes `Addition`, `Constante`, `Multiplication` et `Negation`.
Le code suivant représent l'appel à la fonction `visitAddition` dans la classe `Addition`.

````java
public void accept(Visitor visitor) {
    visitor.visitAddition(this);
}
````

## Question 4
Implémentation de cette resemble à celle de la question 2 cependant au lieu d'afficher un parcour, on évalue un expression.
Evaluation d'une est seulement possible pour le parcour `Infix`, ainsi pour les autres parcours la valeur de retour est toujours zero.

Le code suivant représent l'évaluation une addition et ce code est présent dans la classe `Infix`

```java
public int calculateAddition(Addition addition) {
    return addition.getOpG().calculate(this) + addition.getOpD().calculate(this);
}
```

Le code suivant représent l'appel à la fonction `visitAddition` dans la classe `Addition`.

````java
public int calculate(Visitor visitor) {
    return visitor.calculateAddition(this);
}
````

## Question 5
Implémentation pour calculer la hauteur d'un arbre change un peu par apport aux questions.
Car l'opération pour calculer la hauteur est le même pour toutes les opérations binaires.
On peut donc calculer directement la hauteur pour un opérateur binaire au lieu de calculer cette hauteur pour `Addition`, `Multiplication` et `Negation` individuellement.

De plus le calcul de la hauteur se fait de la même manière dans tous les parcours et grâce au `default`, on peut donc directement définir le calcul dans l'interface Visitor.
Il n'y a donc pas la necéssité de redéfinir le calcul dans les différentes implemantation(Infix, Postfix, Prefix).

Il y a donc pas de duplication de code. On a fait le choix du polymorphisme ici car les différentes fonctions calculent tous la hauteur et seulement les paramètres changent.

On pouvait aussi directement prendre un `noeud` comme paramètre et par la suite _`Downcast`_ le noeud et faire le traitement correspondant. Cela impliquerait que tous les différents types de traitement seront dans la même fonction et donc rendre le code moins lisible

```java
default int height() {
    return 1;
}

default int height(OperateurBinaire oB) {
    int left = oB.getOpG().height(this) + 1;
    int right =  oB.getOpD().height(this) + 1;
    return  Math.max(left,right);
}

default int height(OperateurUnaire oU) {
    return oU.getOpG().height(this) + 1;
}
```

## Question 6

Ajout d'une méthode pour définir la priorité d'un noeud : 

```java
public interface Noeud extends Visitable {
    default int getPriority() {return 0;}	
}
```

Ainsi on peut ordonner les noeuds (opérations) par priorité : Négation (3) > Multiplication (2) > Addition (1) > Constante (0), en surchargeant la méthode getPriority() au besoin. 
Puis pour savoir si il faut afficher des parenthèses, il suffit de comparer la priorité du noeud courrant (père) à ses fils droits et gauches :
```java
if (node.getPriority() > 0 && currentPriority > node.getPriority()) {
    displayNodeBetweenParentheses(node);
} else {
    node.accept(this);
}
```

Ajout d'un nouveau visiteur (InfixParentheses) qui hérite d'Infix. Ainsi, il suffit de redéfinir les méthodes pour lesquelles il faut ajouter l'affichage des parenthèses : (exemple ci-dessous pour la multipication)
```java
@Override
public void visitMultiplication(Multiplication multiplication) {
    displayNode(multiplication.getPriority(), multiplication.getOpG());
    System.out.print(multiplication.getOp());
    displayNode(multiplication.getPriority(), multiplication.getOpD());
}

private void displayNodeBetweenParentheses(Noeud node) {
    System.out.print("(");
    node.accept(this);
    System.out.print(")");
}

private void displayNode(int currentPriority, Noeud node) {
    if (node.getPriority() > 0 && currentPriority > node.getPriority()) {
        displayNodeBetweenParentheses(node);
    } else {
        node.accept(this);
    }
}    
```
