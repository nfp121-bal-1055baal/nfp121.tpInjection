# Adapté au properties de java le fichier de configuration
# fichier martin_fowler.README.TXT
# MovieLister identifiant du bean
bean.id.1=MovieLister
# à quelle classe java ce bean est-il associé ?
MovieLister.class=martin_fowler.MovieLister
# Quelle propriété est à affecter, ici une seule
MovieLister.property.1=finder
# Le mutateur n'a qu'un paramètre
MovieLister.property.1.param.1=MovieFinder

bean.id.2=MovieFinder
MovieFinder.class=martin_fowler.ColonMovieFinder
MovieFinder.property.1=filename
MovieFinder.property.1.param.1=movies1.txt