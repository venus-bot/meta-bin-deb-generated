PACKAGES = "${PN} mime-support"
PROVIDES = "mime-support"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/m/mime-support/mime-support_3.58_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_mime-support = "mime-support_3.58_all.deb"
SRC_URI[deb0.sha256sum] = "c05ebe8f38da4ff19d028c9f4680414149e5c7a746de13bc9db0a562796ed213"
SRC_URI[deb0.md5sum] = "81e70b10c1aeaa6e54eb436c842b5501"

RDEPENDS_${PN} = ""

inherit deb_group

FILES_${PN} = " \
    ./etc/mailcap.order \
    ./etc/mime.types \
    ./usr/bin/compose \
    ./usr/bin/edit \
    ./usr/bin/print \
    ./usr/bin/run-mailcap \
    ./usr/bin/see \
    ./usr/lib/mime/debian-view \
    ./usr/lib/mime/mailcap \
    ./usr/lib/mime/packages/mime-support \
    ./usr/sbin/update-mime \
    ./usr/share/bug/mime-support/presubj \
    ./usr/share/doc/mime-support/changelog.gz \
    ./usr/share/doc/mime-support/copyright \
    ./usr/share/man/man1/compose.1.gz \
    ./usr/share/man/man1/edit.1.gz \
    ./usr/share/man/man1/print.1.gz \
    ./usr/share/man/man1/run-mailcap.1.gz \
    ./usr/share/man/man1/see.1.gz \
    ./usr/share/man/man5/mailcap.5.gz \
    ./usr/share/man/man5/mailcap.order.5.gz \
    ./usr/share/man/man8/update-mime.8.gz\
"
