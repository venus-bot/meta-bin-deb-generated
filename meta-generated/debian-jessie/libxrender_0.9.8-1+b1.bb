PACKAGES = "${PN} libxrender1"
PROVIDES = "libxrender1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxrender/libxrender1_0.9.8-1+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxrender1 = "libxrender1_0.9.8-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8bb5f345e6603bbdd151619e045637512e9c3dad27bd670983a50c15b4d98fb0"
SRC_URI[deb0.md5sum] = "ffb8293c27364c7388d1e69bfab180df"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0) multiarch-support"
DEPENDS = "libc6 libx11-6 multiarch-support"


inherit deb_group

FILES_libxrender1 = " \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1.3.0 \
    ./usr/share/doc/libxrender1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxrender1/changelog.Debian.gz \
    ./usr/share/doc/libxrender1/changelog.gz \
    ./usr/share/doc/libxrender1/copyright\
"
