PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lsb/lsb-base_10.2019051400+rpi1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_10.2019051400+rpi1_all.deb"
SRC_URI[deb0.sha256sum] = "b3e203037786d00dd83a5fa9412c8395090921d373e914cb166b395ee2aedaa4"
SRC_URI[deb0.md5sum] = "5b7844abb596e3fb5614f8672eb327fc"

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
