# VerificaClassificazionePiante
- Ti invito a [Visitare il mio sito](https://nbernardi.tk). 

Di seguito lascio il testo della prova:
## Verifica di Informatica
### Esercizio 1
Definire (nel componente model dell’applicazione) la classe Pianta con I seguenti attributi:
- **rifPicture** un numero intero (da 0 a 7) che fa riferimento all’immagine della pianta all’interno dell’immagine Piante_small.jpeg; con 0 si intende la pianta in alto a sinistra, mentre la pianta in basso a destra avrà rifPicture = 7;
- **scientificName** il nome scientifico della pianta
- **commonName** il nome comune della pianta
***L’applicazione dovrà permettere la visualizzazione di una pianta alla volta scorrendo le piante
rappresentate nel file Piante_small.jpeg.***
Per la classe Pianta deve essere definiti i **criteri di comparazione** per **nome comune** e per **nome scientifico**.
Nella classe controller dell’applicazione si dovrà definire un ArrayList di oggetti di tipo Pianta e, supponendo di aver definito un costruttore con i parametri **rifPicture, commonName, scientificName**, e supponendo che l’ArrayList si chiami piante, si dovranno inserire le 8 piante
mediante le seguenti istruzioni:
<code><pre>piante.add(new Pianta(0, "Ageratum", "Ageratum"));
piante.add(new Pianta(1, "Butterfly-Weed", "Asclepias"));
piante.add(new Pianta(2, "China Pink", "Dianthus"));
piante.add(new Pianta(3, "Garden Impatiens", "Impatiens"));
piante.add(new Pianta(4, "Black-eyed Susan", "Rudbeckia"));
piante.add(new Pianta(5, "Blue Sage", "Salvia"));
piante.add(new Pianta(6, "Dusty Miller", "Senecio"));
piante.add(new Pianta(7, "American Marigold", "Tagetes"));</pre></code>
Con riferimento alla figura:
- inizialmente l’ArrayList è ordinato per nome comune e sotto all’immagine è riportato il nome comune della pianta;
- il pulsante NEXT permette di passare all’immagine successiva (secondo l’ordinamento selezionato). Dopo l’ultima immagine si riparte con la prima.
- il pulsante PREV permette di passare all’immagine precedente (secondo l’ordinamento selezionato). Dopo la prima immagine si riparte con l’ultima.
- Il pulsante “Ordina per nome scientifico” permette di passare all’ordinamento per nome scientifico. In tal caso:
  - Il nome visualizzato sotto alla pianta sarà quello scientifico
  - Il testo del pulsante passerà a “Ordina per nome comune”
  - L’immagine visualizzata non deve cambiare
  - La procedura è analoga se si ripreme il pulsante
### Esercizio 2
In un albero si definisce altezza dell’albero il cammino più lungo dal nodo radice ad un nodo foglia.
Si assume che l’albero nullo e l’albero la cui radice è null abbiano altezza uguale a -1. L’albero che ha solo la radice ha altezza = 0.
Nella classe BinaryTree fornita, definire un metodo che restituisca l’altezza di un albero (binario).
Un albero binario si dice bilanciato in altezza se, per ogni nodo dell’albero la differenza tra l’altezza del sottolabero sinistro e quella del sottoalbero destro è al più 1.
Nella classe BinaryTree fornita, definire un metodo che stabilisca se un albero (binario) è bilanciato oppure no.
