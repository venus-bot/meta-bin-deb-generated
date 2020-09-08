PACKAGES = "${PN} libxrender1"
PROVIDES = "libxrender1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxrender/libxrender1_0.9.10-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxrender1 = "libxrender1_0.9.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "3a90e26b244ad11863cca2c22ce71f88f8bc71f700dab4ad65170b91e4f4f429"
SRC_URI[deb0.md5sum] = "8bda64f6afa8517ca629bed8f6ff3221"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libc6 libx11-6"


inherit deb_group

FILES_libxrender1 = " \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1.3.0 \
    ./usr/share/doc/libxrender1/changelog.Debian.gz \
    ./usr/share/doc/libxrender1/changelog.gz \
    ./usr/share/doc/libxrender1/copyright\
"
