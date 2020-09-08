PACKAGES = "${PN} python-idna"
PROVIDES = "python-idna"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python-idna/python-idna_2.6-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-idna = "python-idna_2.6-1_all.deb"
SRC_URI[deb0.sha256sum] = "a534a4eb31584d72229121adca2facffec3730693dbc2aef5221eacd09c772be"
SRC_URI[deb0.md5sum] = "90de88ac87c249700a667ebabbf996b6"

RDEPENDS_${PN} = "python (<< 2.8) python (>= 2.7.5-5~)"
DEPENDS = "python"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/idna/__init__.py \
    ./usr/lib/python2.7/dist-packages/idna/codec.py \
    ./usr/lib/python2.7/dist-packages/idna/compat.py \
    ./usr/lib/python2.7/dist-packages/idna/core.py \
    ./usr/lib/python2.7/dist-packages/idna/idnadata.py \
    ./usr/lib/python2.7/dist-packages/idna/intranges.py \
    ./usr/lib/python2.7/dist-packages/idna/package_data.py \
    ./usr/lib/python2.7/dist-packages/idna/uts46data.py \
    ./usr/share/doc/python-idna/changelog.Debian.gz \
    ./usr/share/doc/python-idna/changelog.gz \
    ./usr/share/doc/python-idna/copyright\
"
