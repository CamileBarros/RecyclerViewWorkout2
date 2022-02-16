package com.camile.recyclerviewworkout2

import com.camile.recyclerviewworkout2.models.SevenWonders

class DataSource {

    companion object {

        fun createDataSet() : ArrayList<SevenWonders>{

            val list = ArrayList<SevenWonders>()

            list.add(
                SevenWonders(
                    "Christ the Redeemer",
                    "Brazil",
                    "https://www.melhoresdestinos.com.br/wp-content/uploads/2017/07/visao-aerea-cristo-redentor.jpg",
                    "Christ the Redeemer is an Art Deco statue of Jesus Christ in " +
                            "Rio de Janeiro, Brazil, " +
                            "created by French sculptor Paul Landowski and built by " +
                            "Brazilian engineer Heitor da Silva Costa, in collaboration " +
                            "with French engineer Albert Caquot."
                )
            )

            list.add(
                SevenWonders(
                    "Machu Picchu",
                    "Peru",
                    "https://content.skyscnr.com/m/7980b2e63e3962e6/original/Peru.jpg?resize=1800px:1800px&quality=100",
                    "Machu Picchu is an Incan citadel set high in the Andes Mountains " +
                            "in Peru, above the Urubamba River valley. Built in the 15th century " +
                            "and later abandoned, it’s renowned for its sophisticated " +
                            "dry-stone walls that fuse huge blocks without the use of mortar, " +
                            "intriguing buildings that play on astronomical alignments " +
                            "and panoramic views. Its exact former use remains a mystery."
                )
            )

            list.add(
                SevenWonders(
                    "Chichen Itza",
                    "Mexico",
                    "https://content.skyscnr.com/m/6985e714018decc4/original/GettyImages-160677545.jpg?resize=1800px:1800px&quality=100",
                    "Chichen Itza was a major focal point in the Northern Maya Lowlands " +
                            "from the Late Classic (c. AD 600–900) through the Terminal " +
                            "Classic (c. AD 800–900) and into the early portion of " +
                            "the Postclassic period (c. AD 900–1200). The site exhibits a " +
                            "multitude of architectural styles, reminiscent of styles seen in " +
                            "central Mexico and of the Puuc and Chenes styles of " +
                            "the Northern Maya lowlands. "
                )
            )

            list.add(
                SevenWonders(
                    "Colosseum",
                    "Italy",
                    "https://content.skyscnr.com/m/06fefe46087cc3ea/original/GettyImages-478312830.jpg?resize=1800px:1800px&quality=100",
                    "The Colosseum is an oval amphitheatre in the centre of the city " +
                            "of Rome, Italy, just east of the Roman Forum. It is the largest " +
                            "ancient amphitheatre ever built, and is still the largest standing " +
                            "amphitheatre in the world today, despite its age."
                )
            )

            list.add(
                SevenWonders(
                    "Petra",
                    "Jordan",
                    "https://content.skyscnr.com/m/3b003a9d182937bc/original/GettyImages-174273980.jpg?resize=1800px:1800px&quality=100",
                    "Petra is a famous archaeological site in Jordan's southwestern " +
                            "desert. Dating to around 300 B.C., it was the capital of " +
                            "the Nabatean Kingdom. Accessed via a narrow canyon called Al Siq, " +
                            "it contains tombs and temples carved into pink sandstone cliffs, " +
                            "earning its nickname, the \"Rose City.\" Perhaps its most famous " +
                            "structure is 45m-high Al Khazneh, a temple with an ornate, " +
                            "Greek-style facade, and known as The Treasury"
                )
            )

            list.add(
                SevenWonders(
                    "Taj Mahal",
                    "India",
                    "https://content.skyscnr.com/m/2e9a53ac4f346f42/original/GettyImages-480465186.jpg?resize=1800px:1800px&quality=100",
                    "The Taj Mahal, is an ivory-white marble mausoleum on the right bank " +
                            "of the river Yamuna in the Indian city of Agra. It was commissioned " +
                            "in 1632 by the Mughal emperor Shah Jahan to house the tomb of his " +
                            "favourite wife, Mumtaz Mahal; it also houses the tomb of " +
                            "Shah Jahan himself."
                )
            )

            list.add(
                SevenWonders(
                    "Great Wall of China",
                    "China",
                    "https://content.skyscnr.com/m/60a05d2d4cf66a2f/original/GettyImages-125999684_doc.jpg?resize=1800px:1800px&quality=100",
                    "The Great Wall of China is a series of fortifications that " +
                            "were built across the historical northern borders of ancient " +
                            "Chinese states and Imperial China as protection against various " +
                            "nomadic groups from the Eurasian Steppe."
                )
            )


            return list
        }
    }
}