PACKAGES = "${PN} liblzma5"
PROVIDES = "liblzma5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xz-utils/liblzma5_5.2.4-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblzma5 = "liblzma5_5.2.4-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "37af727c1714977551fba83c38e2123b2363680fbae24d78c9747b9bc8325be9"
SRC_URI[deb0.md5sum] = "dcc0f114391e8a4c186a5d92d59f665b"

RDEPENDS_liblzma5 = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblzma5 = " \
    ./lib/arm-linux-gnueabihf/liblzma.so.5 \
    ./lib/arm-linux-gnueabihf/liblzma.so.5.2.4 \
    ./usr/share/doc/liblzma5/AUTHORS \
    ./usr/share/doc/liblzma5/NEWS.gz \
    ./usr/share/doc/liblzma5/THANKS \
    ./usr/share/doc/liblzma5/changelog.Debian.gz \
    ./usr/share/doc/liblzma5/changelog.gz \
    ./usr/share/doc/liblzma5/copyright\
"
