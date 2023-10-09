
/**
 * 
 * @author Richard Ho & Gaëtan Hervé
 */
public class CalculatriceComplexe {

    // Les variables pAff, pRe, pIm, pMod et pArg ne sont pas encore déclarées et initialisées.

    //Fonction à définir plus tard :
    //La fonction boolean estNul(double d)
//retourne vrai si le réel passé en paramètre peut être considéré comme nul (à 2 chiffres après la virgule) et faux sinon

//La fonction void afficheChaine(String s)
//Affiche la chaîne de caractères passée en paramêtre, sans retour à la ligne.

//La fonction void afficheReel(double d)
//Affiche avec 2 chiffres après la virgule le réel passé en paramêtre, sans retour à la ligne.

//La fonction void debug(TYPE value)
//Affiche dans la sortie de debug la valeur passée en paramêtre. La valeur peut être de n'importe quel type primitif, ou une String.


String pModS="";
String pArgS="";
boolean active=false;
switch(pAff) {
    case 'a' :
        if(estNul(pRe)) {
            if(estNul(pIm)) {
                afficheReel(0);
            }
            else if(pIm == 1) {
                afficheChaine("i");
            }
            else if(pIm == -1) {
                afficheChaine("-i");
            }
            else {
                afficheReel(pIm);
                afficheChaine("i");
            }
        }
        else {
            if(estNul(pIm)) {
                afficheReel(pRe);
            }
            else if(pIm == 1) {
                afficheReel(pRe);
                afficheChaine("+i");
            }
            else if(pIm == -1) {
                afficheReel(pRe);
                afficheChaine("-i");
            }
            else if(pIm < 0) {
                afficheReel(pRe);
                afficheReel(pIm);
                afficheChaine("i");
            }
            else {
                afficheReel(pRe);
                afficheChaine("+");
                afficheReel(pIm);
                afficheChaine("i");
            }
        }
        break;
    case 'e' :
        if(estNul(pMod)){
            afficheReel(0.00);
            break;
        }else if(pMod<1.01 && pMod>0.99){
            pModS="";
            active=true;
        }else if(pMod>-1.01 && pMod<-0.99){
            pModS="-";
            active=true;
        }
        if (pArg>0.99 && pArg<1.01){
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^i");
            }
        }else if(estNul(pArg)){
            if(!active){
                afficheReel(pMod);
            }else{
                afficheReel(pMod);
            }
        }else if(pArg<-0.99 && pArg>-1.01){
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^-i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^-i");
            }
        }else{
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^");
                afficheReel(pArg);
                afficheChaine("i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^");
                afficheReel(pArg);
                afficheChaine("i");
            }
        }
        break;
    default :
        afficheChaine("<forme inconnue>");
        break;
}

public static void afficheComplexe( final char pAff, final double pRe, final double pIm, final double pMod, final double pArg )
{ // VOTRE CODE DE L'EXERCICE PRECEDENT :
    // Les variables pAff, pRe, pIm, pMod et pArg sont déjà déclarées et initialisées

/*Code programmée par Richard Ho Et Gaëtan, je l'ai copié ici afin de passer à la prochaine exercoice et diviser les tâches*/
String pModS="";
String pArgS="";
boolean active=false;
switch(pAff) {
    case 'a' :
        if(estNul(pRe)) {
            if(estNul(pIm)) {
                afficheReel(0);
            }
            else if(pIm == 1) {
                afficheChaine("i");
            }
            else if(pIm == -1) {
                afficheChaine("-i");
            }
            else {
                afficheReel(pIm);
                afficheChaine("i");
            }
        }
        else {
            if(estNul(pIm)) {
                afficheReel(pRe);
            }
            else if(pIm == 1) {
                afficheReel(pRe);
                afficheChaine("+i");
            }
            else if(pIm == -1) {
                afficheReel(pRe);
                afficheChaine("-i");
            }
            else if(pIm < 0) {
                afficheReel(pRe);
                afficheReel(pIm);
                afficheChaine("i");
            }
            else {
                afficheReel(pRe);
                afficheChaine("+");
                afficheReel(pIm);
                afficheChaine("i");
            }
        }
        break;
    case 'e' :
        if(estNul(pMod)){
            afficheReel(0.00);
            break;
        }else if(estNul(pMod-1)){
            pModS="";
            active=true;
        }else if(estNul(pMod+1)){
            pModS="-";
            active=true;
        }
        if (estNul(pArg-1)){
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^i");
            }
        }else if(estNul(pArg)){
            if(!active){
                afficheReel(pMod);
            }else{
                afficheReel(pMod);
            }
        }else if(estNul(pArg+1)){
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^-i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^-i");
            }
        }else{
            if(!active){
                afficheReel(pMod);
                afficheChaine("e^");
                afficheReel(pArg);
                afficheChaine("i");
            }else{
                afficheChaine(pModS);
                afficheChaine("e^");
                afficheReel(pArg);
                afficheChaine("i");
            }
        }
        break;
    default :
        afficheChaine("<forme inconnue>");
        break;
}
}

/*
 * Fonction à définir : 
 * La valeur PI
Un réel réprésentant la valeur de PI, avec une précision de 15 décimales !

La fonction double sin(double angle)
Calcule le sinus de l'angle passé en paramètre, exprimé en radians.

La fonction double cos(double angle)
Calcule le cosinus de l'angle passé en paramètre, exprimé en radians.

La fonction double atan(double tangente)
Calcule l'arc-tangente, c-à-d l'angle (exprimé en radians) dont la tangente est passée en paramètre.

La fonction double sqrt(double reel)
Calcule la racine carrée du nombre réel passé en paramètre.

La fonction boolean estNul(double d)
retourne vrai si le réel passé en paramètre peut être considéré comme nul (à 2 chiffres après la virgule) et faux sinon

La fonction double lireChar()
Lit (et retourne) un caractère sur l'entrée standard.

La fonction double lireReel()
Lit (et retourne) un réel (double) sur l'entrée standard.

La fonction void afficheComplexe(char pAff, double pRe, double pIm, double pMod, double pArg)
Affiche le nombre complexe passé en paramêtre soit dans pRe et pIm si pAff vaut 'a', soit dans pMod et pArg si pAff vaut 'e'

La fonction void debug(TYPE value)
Affiche dans la sortie de debug la valeur passée en paramêtre. La valeur peut être de n'importe quel type primitif, ou une String.
 */
public static void main(String[] argv) throws Exception
{

double chiffre1 = lireReel();
double chiffre2 = lireReel();
char operation = lireChar();


switch(operation) {
    case 'c' :
        double pRe2 = chiffre1 * cos(chiffre2);
        double pIm2 = chiffre1 * sin(chiffre2);
        afficheComplexe('a', pRe2, pIm2, 1.0, 1.0);
        break;
    case 'p' :
        double pMod2 = sqrt(chiffre1 * chiffre1 + chiffre2 * chiffre2);
        double pArg2 = 2 * atan(chiffre2/(chiffre1+pMod2));
        afficheComplexe('e', 1.0, 1.0, pMod2, pArg2);
        break;
    case 'b' :
        pMod2 = sqrt(chiffre1 * chiffre1 + chiffre2 * chiffre2);
        pArg2 = 2 * atan(chiffre2/(chiffre1+pMod2));
        char type = lireChar();
        afficheComplexe(type, chiffre1, - chiffre2, pMod2, - pArg2);
        break;
    case '1' :
        type = lireChar();
        if(chiffre1 == 0 && chiffre2 == 0) {
            afficheChaine("<division par zéro>");
        }
        else {
            pMod2 = sqrt(chiffre1 * chiffre1 + chiffre2 * chiffre2);
            pArg2 = 2 * atan(chiffre2/(chiffre1+pMod2));
            afficheComplexe(type, chiffre1/(pMod2*pMod2), - chiffre2/(pMod2*pMod2), 1/pMod2, - pArg2);
        }
        break;
    case '.' :
        type = lireChar();
        double z2A = lireReel();
        pMod2 = sqrt(z2A * z2A * chiffre1 * chiffre1 + z2A * z2A * chiffre2 * chiffre2);
        pArg2 = 2 * atan(z2A*chiffre2/(z2A*chiffre1+pMod2));
        afficheComplexe(type, z2A * chiffre1, z2A* chiffre2, pMod2, pArg2);
        break;
    case '+' :
        type = lireChar();
        z2A = lireReel();
        double z2B = lireReel();
        pMod2 = sqrt((chiffre1+z2A) * (chiffre1+z2A) + (chiffre2+z2B) * (chiffre2+z2B));
        pArg2 = 2 * atan((chiffre2+z2B)/((chiffre1+z2A)+pMod2));
        afficheComplexe(type, (chiffre1 + z2A), (chiffre2 + z2B), pMod2, pArg2);
        break;
    case '-' :
        type = lireChar();
        z2A = lireReel();
        z2B = lireReel();
        pMod2 = sqrt((chiffre1-z2A) * (chiffre1-z2A) + (chiffre2-z2B) * (chiffre2-z2B));
        pArg2 = 2 * atan((chiffre2-z2B)/((chiffre1-z2A)+pMod2));
        afficheComplexe(type, (chiffre1 - z2A), (chiffre2 - z2B), pMod2, pArg2);
        break;
    case '*' :
        type = lireChar();
        z2A = lireReel();
        z2B = lireReel();
        pMod2 = sqrt((chiffre1*z2A-(chiffre2*z2B)) * (chiffre1*z2A-(chiffre2*z2B)) + (chiffre2*z2A+(chiffre1*z2B)) * (chiffre2*z2A+(chiffre1*z2B)));
        pArg2 = 2 * atan((chiffre2*z2A+(chiffre1*z2B))/((chiffre1*z2A-(chiffre2*z2B))+pMod2));
        afficheComplexe(type, (chiffre1*z2A-(chiffre2*z2B)), (chiffre2*z2A+(chiffre1*z2B)), pMod2, pArg2);
        break;
    case '/' :
        type = lireChar();
        z2A = lireReel();
        z2B = lireReel();
        pRe2 = (chiffre1 * z2A + chiffre2 * z2B)/(z2A * z2A + z2B * z2B);
        pIm2 = (chiffre2 * z2A - chiffre1 * z2B)/(z2A * z2A + z2B * z2B);
        pMod2 = sqrt(pRe2*pRe2 + pIm2*pIm2);
        pArg2 = 2 * atan(pIm2/(pRe2+pMod2));
        if(estNul(z2A) && estNul(z2B)) {
            afficheChaine("<division par zéro>");
        }
        else {
            afficheComplexe(type, pRe2, pIm2, pMod2, pArg2);
        }
        break;
    default :
        afficheChaine("<opération inconnue>");
}

}
/*
 * Fonction à définir :
 * La fonction void setFillColor(String color)
Règle la couleur de remplissage à color.
Les valeurs possibles sont "red", "white", "green", "blue", "yellow", "brown" et "black".

La fonction void line(int x1, int y1, int x2, int y2)
Trace un trait de la couleur de remplissage courante,
entre les points (x1, y1) et (x2, y2).

La fonction double sin(double angle)
Calcule le sinus de l'angle passé en paramètre, exprimé en radians.

La fonction double cos(double angle)
Calcule le cosinus de l'angle passé en paramètre, exprimé en radians.

La fonction void debug(TYPE value)
Affiche dans la sortie de debug la valeur passée en paramêtre. La valeur peut être de n'importe quel type primitif, ou une String.
 */
//Affichage Graphique
// les variables center, pX1,pY1, pX2,pY2, pX,pY, pM,pA, pOp,pAff sont déjà déclarées et initialisées
int pXi = (int)(pX*20);
int pYi = (int)(pY*20);
int pX1i = (int)(pX1*20);
int pY1i = (int)(pY1*20);
int pX2i = (int)(pX2*20);
int pY2i = (int)(pY2*20);

if(pOp != 'c' && pOp != 'p') {
    setFillColor("red");
    line(center, center, center+pX1i, center-pY1i);
    if(pOp != 'b' && pOp != '1') {
        setFillColor("green");
        line(center, center, center+pX2i, center-pY2i);
    }
}
setFillColor("blue");
line(center, center, center+pXi, center-pYi);

//rien de particulier pour la forme exponentielle
//penser à améliorer même si ça sert à rien
/* setFillColor("blue");
switch(pAff){
    case 'a' :
        
        break;
    case 'e' :
        line(center, center, center+(int)(pM*20), center-(int)(pA*20));
        break
} */



}
