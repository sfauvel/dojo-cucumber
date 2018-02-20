#language: fr

Fonctionnalité: Décrire ma fonctionnalité

Scénario: Un panier vide à un montant de 0
	Etant donné un panier vide	
	Alors la valeur du panier est 0
	
Scénario: Un panier avec un concombre 
    Etant donné un panier vide
    Et le prix du "concombre" étant 1
    Quand on ajoute 1 "concombre"
    Alors la valeur du panier est 1
    
Scénario: Un panier avec un concombre 
    Etant donné un panier vide
    Et le prix du "concombre" étant 2
    Quand on ajoute 1 "concombre"
    Alors la valeur du panier est 2    
    
Scénario: Un panier avec trois concombres 
    Etant donné un panier vide
    Et le prix du "concombre" étant 2
    Quand on ajoute 3 "concombre"
    Alors la valeur du panier est 6  
    
Scénario: Un panier avec trois concombres et une banane
    Etant donné un panier vide
    Et le prix du "concombre" étant 2
    Et le prix d'une "banane" étant 10
    Quand on ajoute 3 "concombre"
    Et on ajoute 1 "banane"
    Alors la valeur du panier est 16  
    
Scénario: Un panier avec trois concombres plus deux concombres
    Etant donné un panier vide
    Et le prix du "concombre" étant 2
    Quand on ajoute 3 "concombre"
    Et on ajoute 2 "concombre"
    Alors la valeur du panier est 10
    
