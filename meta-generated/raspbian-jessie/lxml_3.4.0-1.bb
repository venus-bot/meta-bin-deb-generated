PACKAGES = "${PN} python-lxml"
PROVIDES = "python-lxml"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lxml/python-lxml_3.4.0-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-lxml = "python-lxml_3.4.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "167b41ccf056a4e5efc26989d3c09376f42c33eb88785c5825b02ae9640e0882"
SRC_URI[deb0.md5sum] = "fbb977066c9e35f457e82f02528688e3"

RDEPENDS_python-${PN} = "python (>= 2.7) python (<< 2.8) libc6 (>= 2.4) libxml2 (>= 2.9.0) libxslt1.1 (>= 1.1.26) zlib1g (>= 1:1.1.4)"
DEPENDS = "python libc6 zlib1g libxml2 libxslt1.1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-lxml = " \
    ./usr/lib/python2.7/dist-packages/lxml/includes/relaxng.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xslt.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/htmlparser.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/html/builder.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/_setmixin.py \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/sax.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/_diffcommand.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/schematron.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/etree_defs.h \
    ./usr/lib/python2.7/dist-packages/lxml/pyclasslookup.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/diff.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/lxml-version.h \
    ./usr/lib/python2.7/dist-packages/lxml/includes/uri.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/dtdvalid.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/lxml.etree.h \
    ./usr/lib/python2.7/dist-packages/lxml/_elementpath.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/c14n.pxd \
    ./usr/share/doc/python-lxml/CREDITS.txt \
    ./usr/share/doc/python-lxml/TODO.txt \
    ./usr/lib/python2.7/dist-packages/lxml/builder.py \
    ./usr/share/doc/python-lxml/README.rst \
    ./usr/lib/python2.7/dist-packages/lxml/html/html5parser.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/usedoctest.py \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/includes/tree.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/doctestcompare.py \
    ./usr/lib/python2.7/dist-packages/lxml/lxml.etree_api.h \
    ./usr/lib/python2.7/dist-packages/lxml/etree.so \
    ./usr/share/doc/python-lxml/examples/simple-ns.xml \
    ./usr/lib/python2.7/dist-packages/lxml/html/soupparser.py \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
    ./usr/share/doc/python-lxml/changelog.Debian.gz \
    ./usr/lib/python2.7/dist-packages/lxml/ElementInclude.py \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/html/_html5builder.py \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
    ./usr/lib/python2.7/dist-packages/lxml/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/config.pxd \
    ./usr/share/doc/python-lxml/changelog.gz \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlparser.pxd \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/lxml/objectify.so \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/lxml/usedoctest.py \
    ./usr/lib/python2.7/dist-packages/lxml/html/ElementSoup.py \
    ./usr/lib/python2.7/dist-packages/lxml/cssselect.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlerror.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/etreepublic.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xmlschema.pxd \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/lxml/html/defs.py \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/__init__.py \
    ./usr/share/doc/python-lxml/copyright \
    ./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/rng/iso-schematron.rng \
    ./usr/lib/python2.7/dist-packages/lxml/html/clean.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/__init__.py \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xpath.pxd \
    ./usr/lib/python2.7/dist-packages/lxml-3.4.0.egg-info/SOURCES.txt \
    ./usr/lib/python2.7/dist-packages/lxml/includes/xinclude.pxd \
    ./usr/lib/python2.7/dist-packages/lxml/html/__init__.py \
    ./usr/share/doc/python-lxml/examples/simple.xml \
    ./usr/lib/python2.7/dist-packages/lxml/html/formfill.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
