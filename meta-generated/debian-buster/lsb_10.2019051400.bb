PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lsb/lsb-base_10.2019051400_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_10.2019051400_all.deb"
SRC_URI[deb0.sha256sum] = "2dd69416c4e8decda8a9ed56e36275df7645aea7851b05eb16d42fed61b6a12f"
SRC_URI[deb0.md5sum] = "d8818e0a4e6402575c108d97d386abb8"

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
