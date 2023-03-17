package adventOfCode2021

object dayFour extends App {

  val input: List[String] = "69 12 14 26 84\n19 76 45 78 99\n22 80 90 33 46\n75 31 21  6 28\n\n22 52 65 75  2\n91 12 45 18 94\n38 66 85 39  1\n24 36 55 74  3\n89 14 79 99 48\n\n19 58 95 22  6\n48 28 57 30 72\n12 67 15 37 18\n33  1 49 90 60\n35 41 47 11 84\n\n89 27 65 68 19\n38 83 21 81 91\n67 61 87 30 10\n36 45 66 56  4\n82 71 44 96 90\n\n29 84 40 62 92\n69 39  2  1 56\n 6 20 27 97 54\n14 28 65 52 32\n31 58 36 95  8\n\n84 46  4 15 66\n28 99 17 68 37\n57  6  8 64 12\n18 23 24 45 34\n39 55 85  5 19\n\n56 63 13 76 35\n 7 94 24 23 67\n60 44 12 25 71\n78 19 42 87 39\n 2  3 69 26 22\n\n75 43 42 45 77\n57 59 88  3 49\n27 23 64 60 12\n53 85 83 52 21\n24 50  6 31 80\n\n34 43 75 69 59\n93 23 46 48  2\n 4 15 61  5 96\n80 97 27 51 33\n25 44 79 32 17\n\n16 67 81 96 42\n21 79 45 78 28\n39 91 86 51 88\n62 94 99 41 27\n84 30 22 74  8\n\n19 14 10 76 17\n13  1 73  0 55\n97 26 98  4 15\n44 87 61 80 11\n74 16 94 45 75\n\n20 36 25 81  7\n93 40 83 71 32\n56  9 61 95 17\n79 48 72 87 15\n 0 12 78 13 54\n\n76 42 24 16 20\n94 89 38 85  4\n96 99 45 78 84\n88 55 66 34 63\n47 95 27  6 17\n\n75 24 23  4 81\n95 58 40 52 13\n 3  2 45 50 73\n98 39 92 14 28\n12  9 41 10 17\n\n42 95 23 93 88\n29 14 38 80 48\n55 72 69 64 34\n18 58  8 96 30\n16  7 20  0 46\n\n25 22 65 17 19\n85  0 73 46 10\n43 35 12 59 51\n76 40 42 94 78\n79 28 91 39 31\n\n84 70 34 12  8\n51  7 93 66 42\n 0 39  4 22 38\n 5 86 65 82 44\n74 19 98 35 53\n\n71 20 72 83 34\n19  6 88 51 27\n98 42 56 62 69\n49 11 99 50 21\n90 18 47 15 91\n\n 2 93  5 60 98\n71 73 12 50 18\n30 87  9 69 21\n23 90 92 49  1\n99 34 11 33 58\n\n18 83 82 92 72\n16 19 73 25 55\n35 20  8 41 39\n45 71 70 23 30\n 4 15 57 58 80\n\n 2 50 95 34 83\n72 62 15 89 12\n20 39 65 68 33\n92 67 60  1 56\n29 86 23 37 45\n\n36 86 92 58 74\n47 39 30 40 56\n17 18 14  4 97\n20 28 62 94 80\n88 84 98  0 38\n\n85 88 47 43 44\n82 52 60 61 42\n39 87 33 36 14\n40 49 13 20  4\n86 92 19 90  2\n\n 5 36 48 66 72\n44 98 87 24 79\n60 19  3 15 47\n42 25 93 57 88\n32 14 62 64 34\n\n65 72 80 96 20\n82 38 52 19 29\n39 70 95 54 84\n71 85 32 16 92\n14 81 28 23 17\n\n20 89 61 53 83\n87 41 13 66 78\n88 22 58 56 94\n60 12 15 17 28\n70 49 36 64 11\n\n96 73 81 30 98\n40 15 33 37 54\n 0 76 22 13 36\n17 49 44 27 51\n26  6 92 25  1\n\n25 95 96 31 22\n34 42 41 60 23\n75 32 77 81 15\n17 79  6 11 94\n97 85 66 44 43\n\n 1 18 75 85  0\n21 35 22 64 55\n60 50 57 47 67\n68 61 56 63 90\n49 65 33 59 30\n\n75 11 64 28 37\n58 82 40 59  4\n24 77 69 22  9\n60 36 89  7 68\n53  2 94 43 72\n\n34 11 92 55 25\n72 68 76 67 24\n 8 50 56 59 12\n90 91 86 13 29\n57 79 16 26 42\n\n94 49 69 66 52\n47 65 43 38 81\n64 40 10 32 13\n70  3 74 83 37\n56 59 55 78 39\n\n87 95 51 32 35\n21  4 80  8 24\n 1 13 43 58 92\n47 69 49 37 16\n65 74 31 57 28\n\n28 14 10 30 32\n13 50 19 41 77\n76 61 46 97 15\n36 17 62 74 57\n26 66 99 51 64\n\n40 11 56 66 67\n26 81 45 13 51\n80 82 57 87 61\n46 16 17 21 72\n42 95 68 33 83\n\n54 94 23 42 53\n36  4 43 92 87\n 8 59 69 62  1\n86 98  9  2 73\n 7 12 83 67 24\n\n56 79 71 38  6\n17 20 28 80 57\n84 22 83 61 50\n 0 52 36 92  4\n70 55 63 12  3\n\n18  9 47 22 32\n21 95 45 50 34\n84 69 19 16 36\n85 62 71 88 98\n55 80 37 63 83\n\n19 51 99 30 48\n 9  3 89 22 46\n 6 76 15 95 90\n53 12 62 67 98\n74 31 16 54 65\n\n42 58 20 27 64\n18 57 76 82 43\n72  8 61 60 12\n88 13 49 91 78\n96 83 51 86 14\n\n49 79 90 21 85\n39 10 78  1 47\n66 70 86  9 74\n31 62 50 58 25\n19 73 28  2 55\n\n78 29 34 87 77\n 2 71  8 51 98\n62 84 89 27 85\n90 94 44 30 93\n28 68 31 20 75\n\n73 68 76 51 87\n91 65  9 29 15\n42 35 74 72 25\n52 45 31 53 97\n23 19 54 83 41\n\n90 10 58 40 89\n76 71 85 56 65\n25 80 19  0 28\n60  7 47 98 67\n63 81 37 91 35\n\n78 56 29 50 32\n79 92 38 49 45\n70 80 76 86 64\n53 22 20 66 60\n77 25 84 93 88\n\n83 64 56 13 88\n63 25 65  1 45\n 7 61 57 37 75\n58 96 84 91 28\n43 69 32 74 99\n\n39 54 73 61 46\n60 44 71 33 89\n 4 67 10  2 96\n58  8 20 68 93\n56 17 38 94 34\n\n89 59 36 31 94\n91 34 83 55 54\n99 40 30 56 11\n49 33 42 39 70\n 2 64 17 25 87\n\n25 97  2 45 93\n88 92 78 32 69\n67  6 47 37 96\n51 40 82 57 99\n30 38 29 55 85\n\n65  7 29 39 58\n28 27 20  0 84\n32 31 44  4 57\n17 79 92 33 41\n94 35 22 74  5\n\n62 77 48 50 97\n39 91 42 73 88\n23  3  6 17 15\n13 37 25 65 16\n94 12 54  0 14\n\n45 55  3  2 40\n49 58 43  5 72\n60 46 33 85 79\n61 34 27 92 35\n54 51 65 23 17\n\n 4 70 20 80 94\n 1 74 53 83 10\n91 16 46 63 75\n39 90 81 27 17\n38 19 62 44 92\n\n16 25 99 27 66\n80  3 38 10 11\n52 98 83  7 76\n70 29 79 96 42\n41 74 68 36 82\n\n50 73 72 40 93\n60 96 52 74 63\n51 30 87 41 82\n44  4 59  0  1\n43 62 10 13 58\n\n92 98 20 94 95\n37 57 74 47 38\n36 89 97 14 59\n81 46 66 55 35\n82 62 42 12 28\n\n 5 81  8 23 36\n61  7 94 95 74\n91 71  6 32 65\n79 30 67 49 37\n 9 44 84 58 82\n\n19 56 13 80 65\n79 59 57 10 44\n78 97 49 26 70\n72 95 18 14 96\n 3 99 33 32 41\n\n 5 42 18 14 57\n19 62  6 92 96\n 2 58 75 49  9\n24 48 55 60 67\n91 37 27 34 59\n\n65 11 18 78  6\n30 76 61 27 15\n49 25 59 17 29\n20 24 99 37 40\n93 90 68 71 22\n\n34 15 77 98 70\n58 21 54  8 60\n49 32 62 56 87\n30 17 83 85 23\n80 48 10 26 24\n\n39 90 21  4 71\n53 55 24 27 28\n 5 87 54 66 20\n32 18 10 77 59\n99 80 91 13 34\n\n 8 80 50 63 42\n 9 40 51 83 93\n91 89 32 74 41\n28 65 29 33 55\n59 31 99 36 19\n\n 4 96 28 51 14\n84 39 98 59 15\n87 45 65 83 78\n 2  8 49  0 36\n 7  9 64 58 74\n\n23 10 70 59 36\n55 84 18 40 50\n47 28 58 72  8\n24 60 34 44 79\n77 73 89 95 92\n\n83 77 61 81 36\n50 19 31 69 35\n15 39 75 18 43\n98 51 25 54 63\n 9 74 91  6 88\n\n40 81 16 82 25\n66 57 98 14  6\n92 71 27 39 87\n17 12 20 23 47\n83 22  4 90 73\n\n92 22 17 80 55\n20 35 34 62 88\n23 47 56 14  8\n45 52  2 36 67\n28 69  5 93 44\n\n99 88 14 47  2\n22 51 15 57 68\n33 13 71 80  9\n63 69  7 90 74\n17 87 36 46 16\n\n67 27  7 65 73\n13 87 16 99  6\n33 30 96 41 23\n 0 10  9 98 72\n53 52 81 18 24\n\n49 89 44  9 35\n71 67 21 32  7\n55 50 37 34 64\n31  8  1 17 73\n48 27 81 39  0\n\n81 40 50 48 47\n33 14 76 56 25\n62 93 57 78 85\n51 44  2 43 16\n 0 74 27 20 22\n\n96 30 47 33 57\n91 70 31 45 84\n20 13  2 36 28\n 6 53 55 81  7\n72 27 44 12 39\n\n27 94 70 54 72\n62 39 46 89 29\n43 12 86 35  2\n66 34 55 82 78\n57  0 32 21 79\n\n46 18 29 82  5\n 7 52 10 12 45\n23 20 94 43 32\n58 40 83 37 75\n90 55 27 61 99\n\n17 60 69 63 39\n41 66 23 56 79\n57 51 50 28 85\n90 20 16 34 81\n74 64 46  4 62\n\n29 55 38 24 11\n44 62 49 32 22\n81 23 26  0 86\n28 25 33  1 88\n58 14 97 30 27\n\n20 69  1 86 77\n89 92 15 54 93\n94 74 51  5 97\n68  8 38 21 46\n79 87 40 34 62\n\n81 49  5 52 77\n 3 56 12 60 79\n17  7 22 20 34\n19 30 18 57 72\n97 70 78 69 64\n\n 2 93 28 54 49\n62 81 89  6 67\n32  4 42 25 14\n24 91 40 77 50\n41  5 47 12 95\n\n63 98 66 51 39\n25 46 80 23 18\n90 70 24 47 14\n15 91 61 85 87\n82 92 58 55 40\n\n94 83 68 23 34\n26 35 55 84 97\n66 19 85 77 72\n73 89 75 42 87\n22 40 20 93 67\n\n53 70 42 54 65\n72 24 32 89 83\n23 33  5 79 60\n 0 61 52 96 49\n30 17 94  3 40\n\n64 65  6 86 53\n10 56  2 88 73\n11 62 37 84  1\n71 42 76 51 77\n41 83 19 14  4\n\n11 26 59 12 66\n19 53 52  3 74\n65 18 10 40 99\n88 61 69 64 92\n24 23  9 77 33\n\n95 81 27 80 63\n52 92 18 90 77\n34 98 88 41 25\n36 49 29 71 61\n 6 12 78 15 40\n\n15  1 48 41  8\n 5 74 61 11 78\n39 59 63 42 17\n23 13 22 88 47\n 4 95 33 44  6\n\n81 16 38 97 74\n37 58  2 17 10\n99 44  1 20  6\n85 68  0 98 95\n14 24 93 45 80\n\n83 39 90 48 38\n96 85 84  4 21\n55  5 91 33 43\n49 37 79 68 20\n93 69 54 71 99\n\n88 69  1 65 20\n47 15 57 54 25\n44 36 60 99 29\n74 46 75 82 40\n98 26 77 43 63\n\n34 48 25 64 32\n66  1 71 47 99\n21 82 41 14 57\n 3 69 28  5 79\n27 54 87 44 23\n\n85 52 77 49 87\n92 19  5 37 20\n64 69 13 95 55\n70 56 86 75 30\n73  6 88  9 54\n\n29 82 35 23 96\n11 65 56 86 36\n34 83 90 74  2\n19 46 61 24 45\n63  5 94 48 50\n\n15 33 21 76 79\n28 56 63 38 65\n44 41 10 62 60\n23 24 16 88 43\n30 40 19  7  9\n\n55 12 27 80 67\n42 90 63 10 98\n74 50 65 18 17\n79  2 96 25 93\n24 82 59 56 43\n\n 7 42 31 49 52\n59 50  3 28 58\n11 55 75 91 60\n65 76  1 38 23\n86 19 64 22 80\n\n73 81 41 54 92\n70 39 66 38 27\n89 15 80 22 87\n36 12 48 93 26\n44 85 19 60 49\n\n 8 28 76 19  5\n86 34 50 98 29\n80 91 46 90 40\n33 58 21 22 49\n64 41 87 92 72\n\n16 61 73 82 25\n 8  1 53 10 71\n47 99 90 93 39\n87 74 41 52 69\n17 49 91 30 33"
    .split("\n").toList.map(_.replace("  ", " ")).filter(_.nonEmpty)

val testInput = "1 1 1 1 1\n7 4 9 5 11\n17 23 2 0 14\n21 24 10 16 13\n6 15 25 12 22\n18 20 8 19 3\n1 1 1 1 1\n 2 2 2 2 2\n 3 3 3 3 3\n4 4 4 4 4\n 5 5 5 5 5\n".split("\n").toList.map(_.replace("  ", " ")).filter(_.nonEmpty)


  val bingoBoards: List[List[String]] = testInput.map(_.trim).map(_.split(",").toList).flatMap(_.map(_.split(" ").toList))

  val z = bingoBoards.splitAt(5).toString.take(5)

  println(bingoBoards)
  println(z)
  //println(input)

}
