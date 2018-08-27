package db;

import models.*;

import java.util.Date;

public class Seeds {
    public static void seedData() {

        DBHelper.deleteAll(Article.class);
        DBHelper.deleteAll(Journalist.class);
        DBHelper.deleteAll(Editor.class);



        Editor mark = new Editor ("Mark Ditzel", new Date(2017, 07, 25), 1);
        DBHelper.save(mark);
        Editor beata = new Editor ("Beata Ficek", new Date(2017, 02, 11), 2);
        DBHelper.save(beata);

        Journalist vicky = new Journalist ("Victoria Jackson", new Date(2010, 07, 12), 8);
        DBHelper.save(vicky);
        Journalist diggory = new Journalist ("Diggory Phillbrow", new Date (2014, 11,02), 4);
        DBHelper.save(diggory);

        Category techNews = new Category("Tech News");
        DBHelper.save(techNews);
        Category interviews = new Category("Interviews");
        DBHelper.save(interviews);

        Date dateOfAppArticle1 = new Date(2018, 06,11);
        Date dateOfSubArticle1 = new Date(2018, 06, 9);

        Article technews1 = new Article(ArticleFormat.FEATURE, "CodeBase's VR revolution",
                "Chopping-fruit-game has met its' match",
                mark, diggory, techNews, "Hello");
        DBHelper.save(technews1);

        Article technews2 = new Article(ArticleFormat.COLUMN, "Codeclan",
                "Welcome to Codeclan",
                mark, diggory, techNews, "Hello");
        DBHelper.save(technews2);

        Article technews3 = new Article(ArticleFormat.COLUMN, "Here's what happened to Microsoft's Xbox VR gaming headset",
                "The company came close to announcing a VR headset, but it's been put on ice. Here’s why.",
                mark, diggory, techNews, "Two months ago, Microsoft said it didn't have specific plans to create an Xbox VR headset. What it didn't say is that it had been working on a device, but put existing VR plans on hold until better technology comes along.\n" +
                "\n" +
                "Microsoft courted partners over the past couple years to create games for a virtual reality headset designed to work with the Xbox video game console, according to people familiar with the matter. While the physical designs of the device weren't widely known, the screen quality specifications were considered good -- but not as good as those for Facebook's rival Oculus Rift or HTC's Vive headsets, the people said.\n" +
                "\n" +
                "Earlier this year, however, Microsoft started telling partners it was putting its Xbox headset plans on hold. Two people familiar with Microsoft's thinking said the company decided to wait until promising new tech like wireless headsets were more feasible. Today, high-end headsets like Sony's $299 PlayStation VR, Facebook's $399 Oculus Rift and and HTC's $499 Vive rely on long and bulky wires plugged into their respective devices in order to work. Wireless adapters meanwhile, add about $300 in cost.\n" +
                "\n" +
                "The move wasn't much of a surprise to partners and those briefed on the device, considering Microsoft has largely stuck to a supporting role during VR's recent renaissance, led by Sony, HTC, Steam game store owner Valve and Facebook's Oculus VR. And you could argue it's a smart strategy.\n" +
                "\n" +
                "zuckerberg-oculus-connect-3-demostracion.jpg\n" +
                "Facebook CEO Mark Zuckerberg (right) has said he believes VR will change the way we use computers.\n" +
                "\n" +
                "Facebook\n" +
                "So far, the VR market has struggled to win over a mass market of consumers. Analysts believe Sony has sold the most high-end VR headsets, tallying 3 million PlayStation VRs sold since that product's launch in 2016. In May, Facebook released its $199 Oculus Go, a midlevel standalone VR headset. Though Facebook declined to disclose sales data, SuperData Research estimates it sold 289,000 units in the three months ended in June. That may not seem like much when stacked against the 41.3 million iPhones Apple sold during that same time, but the researcher said it's better than what Facebook's higher-end Oculus Rift did in the second half of 2017.\n" +
                "\n" +
                "All told, VR today is a mixed bag. \"Virtual reality may yet become a massive mainstream hit, but it's not going to happen with this generation of tech,\" CNET's Dan Ackerman wrote in April. \"It's time to throw in the towel.\"\n" +
                "\n" +
                "Flirting with VR\n" +
                "Microsoft's decision to hold back its VR plans comes after a series of public fits and starts.\n" +
                "\n" +
                "Rumors that Microsoft was building a gaming headset began as early as 2012, when what were supposedly internal plans leaked online. That was the same month the first Oculus headset prototype debuted at the E3 video game conference in Los Angeles.\n" +
                "\n" +
                "microsoft-windows-mixed-reality-vr\n" +
                "Last year, Microsoft made PCs work with a series of devices built under its \"Windows Mixed Reality\" initiative. But reaction has been mixed.\n" +
                "\n" +
                "Microsoft\n" +
                "By 2015, Microsoft was instead touting a relationship with Facebook, which bought Oculus the year before for over $2 billion. Back then, Microsoft said it would offer gamers a chance to play Xbox games using the Rift headset. The company, in the meantime, was also increasingly focusing efforts on its well-received HoloLens mixed reality headset, which overlays computer images on the real world.\n" +
                "\n" +
                "\"Oculus had such a head start,\" Xbox head Phil Spencer said at the time. \"It's good for Windows, and it's good for Xbox.\"\n" +
                "\n" +
                "In 2016, Spencer said he wanted to make sure any Xbox VR headset brought something \"unique\" to the table. \"I don't think the unique add is to plug into the Xbox One console,\" he said. \"That's not the magic unlock to me.\"\n" +
                "\n" +
                "In the meantime, Microsoft created a set of features for its Windows 10 operating system software for PCs known as Windows Mixed Reality, which was released late last year. This technology allowed companies like Dell, Lenovo, Acer and HP to build headsets based on VR technology Microsoft developed, launching for as little as $399.\n" +
                "\n" +
                "But the Windows Mixed Reality headsets got a mixed reception, and prices were cut by as much as half earlier this year. Microsoft had already decided to focus on VR for Windows rather than Xbox at that point, a person aware of Microsoft's discussions said. But the response didn't help, another person said.\n" +
                "\n" +
                "During the Electronic Entertainment Expo, or E3, this June, Microsoft's chief marketing officer for gaming, Mike Nichols, made it official. \"We don't have any plans specific to Xbox consoles in virtual reality or mixed reality,\" Nichols told GamesIndustry.biz.\n" +
                "\n" +
                "Well, not anymore.\n" +
                "\n" +
                "To plant a flag, or not\n" +
                "Not much about the design of Microsoft's Xbox VR headset is known. Those privy to early briefs said the device wasn't particularly designed to break new ground. Instead, an Xbox VR headset was discussed as being more of a competitor to Sony's PlayStation VR, whose screen quality and visuals are considered good, but not the best in the industry. The Oculus Rift, HTC Vive Pro and Samsung Odyssey offer the best-quality images among the widely available headsets, according to CNET's reviewers. (Facebook's expected to show off a next-generation Oculus headset next month.)\n" +
                "\n" +
                "34-sony-playstation-vr-2016.jpg\n" +
                "Sony's PlayStation VR has sold 3 million units since launching in October of 2016.\n" +
                "\n" +
                "Sarah Tew/CNET\n" +
                "Microsoft's approach stands in contrast to the marketing for the Xbox One X, an upgraded Xbox released in 2017 that was touted as the most technically powerful video game console on the market. Some of the people in discussions with Microsoft wondered why it would sell such a powerful console and then plug in a relatively so-so headset to go with it.\n" +
                "\n" +
                "But there's another and potentially more pressing question Microsoft would have to answer if it released an Xbox VR device: \"Do Xbox gamers really want VR?\" said Brian Blau, an analyst at Gartner who used to work in the VR industry. Gamers, he noted, tend to be vocal about what they want to buy from companies, and he hasn't noticed many people clamoring for an Xbox headset.\n" +
                "\n" +
                "\"I haven't seen the gamer community rally around VR like they have other things,\" he added.");
        DBHelper.save(technews3);
    }

}
