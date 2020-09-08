PACKAGES = "${PN} libxext6"
PROVIDES = "libxext6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxext/libxext6_1.3.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxext6 = "libxext6_1.3.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "c98094a2dcc1965bb04ed8929fca6899e1cad3ad1e0f29a5c20a79338dacb702"
SRC_URI[deb0.md5sum] = "2e2ea23c03c37c7fc287142c7a1e2c74"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0) multiarch-support"
DEPENDS = "libc6 libx11-6 multiarch-support"


inherit deb_group

FILES_libxext6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6.4.0 \
    ./usr/share/doc/libxext6/changelog.Debian.gz \
    ./usr/share/doc/libxext6/changelog.gz \
    ./usr/share/doc/libxext6/copyright\
"
