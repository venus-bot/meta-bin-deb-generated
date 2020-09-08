PACKAGES = "${PN} libjbig0"
PROVIDES = "libjbig0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/j/jbigkit/libjbig0_2.1-3.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjbig0 = "libjbig0_2.1-3.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0bc2ba98965d17b1f7fb3c6fd79f09a5cad849e8488bc27c62c01afd181757c2"
SRC_URI[deb0.md5sum] = "cd5a114c30310f6a976797b292643557"

RDEPENDS_libjbig0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libjbig0 = " \
    ./usr/lib/arm-linux-gnueabihf/libjbig.so.0 \
    ./usr/share/doc/libjbig0/changelog.Debian.gz \
    ./usr/share/doc/libjbig0/changelog.gz \
    ./usr/share/doc/libjbig0/copyright\
"
