PACKAGES = "${PN} libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.32-2.2~deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.32-2.2~deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "529ddf038681384ea4f6a9efb636c3efdc2f2971b859ebd50d5dcc6571bd3bad"
SRC_URI[deb0.md5sum] = "3b558a33037c8f699030d4f654bca302"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.17) libgcrypt20 (>= 1.8.0) libxml2 (>= 2.9.0)"
DEPENDS = "libc6 libgcrypt20 libxml2"


inherit deb_group

FILES_libxslt1.1 = " \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.20 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.32 \
    ./usr/share/doc/libxslt1.1/AUTHORS \
    ./usr/share/doc/libxslt1.1/FEATURES.gz \
    ./usr/share/doc/libxslt1.1/NEWS.gz \
    ./usr/share/doc/libxslt1.1/README \
    ./usr/share/doc/libxslt1.1/README.Debian \
    ./usr/share/doc/libxslt1.1/TODO \
    ./usr/share/doc/libxslt1.1/changelog.Debian.gz \
    ./usr/share/doc/libxslt1.1/changelog.gz \
    ./usr/share/doc/libxslt1.1/copyright \
    ./usr/share/lintian/overrides/libxslt1.1\
"
