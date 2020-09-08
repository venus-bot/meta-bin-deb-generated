PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lsb/lsb-base_4.1+Debian13+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_4.1+Debian13+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "1a200ffcc9d21838768f3acdc512e6ad6a8502bb70ecd3f597b660a56acaf739"
SRC_URI[deb0.md5sum] = "22c397322b6642eb00fec2fe0b1ef447"

RDEPENDS_${PN}-base = ""

inherit deb_group

FILES_lsb-base = " \
    ./lib/lsb/init-functions \
    ./lib/lsb/init-functions.d/20-left-info-blocks \
    ./usr/share/doc/lsb-base/NEWS.Debian.gz \
    ./usr/share/doc/lsb-base/README.Debian.gz \
    ./usr/share/doc/lsb-base/changelog.gz \
    ./usr/share/doc/lsb-base/copyright\
"
