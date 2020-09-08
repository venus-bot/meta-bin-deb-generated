PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lsb/lsb-base_4.1+Debian13+rpi1+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_4.1+Debian13+rpi1+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "164132410da6b2267df4fe34391e8ecd44349d29636317b09c65f3aa1b5aa111"
SRC_URI[deb0.md5sum] = "837f7b1f29c7f4ed354fd13d3b76fa2f"

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
