PACKAGES = "${PN} libxext6"
PROVIDES = "libxext6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxext/libxext6_1.3.3-1+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxext6 = "libxext6_1.3.3-1+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "cedf391d383e259a348e0d747b00216050270ba4e7af0b6051fe65c989e82b45"
SRC_URI[deb0.md5sum] = "a0d2feb226bbdd59578bb54321abf3f8"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libc6 libx11-6"


inherit deb_group

FILES_libxext6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6.4.0 \
    ./usr/share/doc/libxext6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxext6/changelog.Debian.gz \
    ./usr/share/doc/libxext6/changelog.gz \
    ./usr/share/doc/libxext6/copyright\
"
